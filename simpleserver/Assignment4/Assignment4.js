var fs = require("fs");

var writeStream = fs.createWriteStream("Write_A_File.txt");
writeStream.write("Hey Hoo!lets go ");

writeStream.end();