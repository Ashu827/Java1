var express = require('express')
var app = express()
  

app.get('/', function(req,res){
    res.end('Hello Ashutosh')
    console.log(process.argv[2]);
})
app.listen(process.argv[2])

