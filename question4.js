 var XMLHttpRequest = require("xmlhttprequest").XMLHttpRequest;

 let request = new XMLHttpRequest();

 request.open("GET","http://www.example.com/api/get/1",true);
 request.send();
 request.onload = () =>{

      console.log(request);

      if(request.status===200)
      {
          console.log(JSON.parse(request.response));
      }
      else{
          console.log(`error ${request.status} ${request.statusText}`);
      }
 }





//    const fetch = require("node-fetch");

//    fetch('http://www.example.com/api/get/1')
//    .then(response =>{
//        return response.json();
//    })
//    .then(users => {
//        console.log(users);
//    });





