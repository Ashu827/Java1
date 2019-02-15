var express = require('express')
var app = express()
// var DateDiff = require('date-diff');
 
app.get('/year', function (req, res) {
  var age=req.query.age;
 
  var date=new Date();
  var year=date.getFullYear();
  var diff=year-age;
  console.log("age is");
    res.send('your age is '+diff);
    res.end();
    
})

app.listen(3003)
