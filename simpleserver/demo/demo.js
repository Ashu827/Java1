const http = require('http');
const url=require('url');
const path=require('path');
const fs=require('fs');

 
const mimeTypes={
	"html":"text/html",
	"jpeg":"image/jpeg", 
	"jpg":"image/jpg",
	"js":"text/javascript",
	"css":"text/css"
};

http.createServer(function(req, res){
	var uri=url.parse(req.url).pathname;
	var filename=path.join(process.cwd(), unescape(uri));
	console.log('Loading'+uri);
	var stats;
	
	try{
		stats=fs.lstatSync(filename);
	}
	catch(e){
		res.writeHead(404,{ 'Content-type':'text/plain'});
		res.write('404 Not found\n');
		res.end();
		return;
	}
	if(stats.isFile()){
	var contentTypes=mimeTypes[path.extname(filename).split(".").reverse()[0]];
	res.writeHead(200,{'Content-type':contentTypes});
	
	var fileStream=fs.createReadStream(filename);
	fileStream.pipe(res);  
	}
	else if(stats.isDirectory()){
		res.writeHead(302,{
			'Location':'home.html',
			'Location':'page.html'
		});
		res.end();
	}
	else{
		res.writeHead(500,{'Content-type':'text/plain'});
		res.write('500 Internal Error\n');
		res.end();
	}
}).listen(3020);
	