import axios from "axios";

export const validateUserExists = (email, password) => {

  axios
  .get(`http://localhost:9001/user/email/${email}`)
  .then((response) => {
    const {emailResponse, passwordResponse} = response
    if(email === emailResponse && password === passwordResponse){
      alert("Email correct!")
    } else{
      alert("Incorrect email...")
    }
    console.log(response.data.content);
  })
  .catch((err) => {
    console.log(err);
  });

}