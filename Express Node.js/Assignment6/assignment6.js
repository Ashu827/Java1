var http=require('http');
var fs=require('fs');
var express = require('express')
var app = express()

app.use(express.static("public"));

var server=app.listen(3050)