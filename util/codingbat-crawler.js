function getNames(){
    var tds = document.getElementsByTagName("td");
    var toLog = "";
    for(var i=3; i<tds.length; i++){
        var name = "warmup-1"
        var str = tds[i].innerText;
        var smallOut
        if(str.charAt(str.length-1) == 'H'){
            smallOut = str.substring(1,str.length-2);
        }else{
            smallOut = str.substring(1);
        }
        toLog += i-2 + ". ["+smallOut+"](https://github.com/liampuk/code-practice/blob/master/codingbat/python/"+name+"/"+smallOut+".md) - _[codingbat]("+ tds[i].getElementsByTagName("a")[0].href +")_\n"
    }
    console.log(toLog);
}

function getContent(){
    var name = document.getElementsByClassName("h2")[3].innerText;
    var desc = document.getElementsByClassName("max2")[0].innerText
    var exl = document.getElementsByTagName("td")[3].innerHTML.split("<br>")[1]+"\n"+document.getElementsByTagName("td")[3].innerHTML.split("<br>")[2]+"\n"+document.getElementsByTagName("td")[3].innerHTML.split("<br>")[3].split("<p>")[0];
    var code = document.getElementsByClassName("ace_content")[0].innerText;
    var link = window.location.href;
    console.log("# "+name+"\n\n"+desc+"\n\n```\n"+exl+"\n```\n\n**Solution:**\n\n```java\n"+code+"```\n\n> _[codingbat]("+link+")_");
}