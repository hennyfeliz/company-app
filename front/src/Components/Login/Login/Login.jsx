import { Card } from "react-bootstrap";
import "./Login.css"
import image from "./avatar.png"

const Login = () => {
  return (
    <>
      <Card classNameName="m-5">
        <div className="w-75 container">
          <div className="login">
            <div className="avatar">
              <img src={image} />
            </div>
            <h2>Login</h2>
            <h3>Welcome back Kelly</h3>

            <form className="login-form">
              <div className="textbox">
                <input type="email" placeholder="Username" />
                <span className="material-symbols-outlined">  </span>
              </div>
              <div className="textbox">
                <input type="password" placeholder="Password" />
                <span className="material-symbols-outlined">  </span>
              </div>
              <button type="submit">LOGIN</button>
              <a href="#">Forgot your credentials?</a>
            </form>
          </div>

        </div>
      </Card>
    </>
  )
}

export default Login