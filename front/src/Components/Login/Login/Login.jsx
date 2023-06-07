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
            <h2>Usuario existente</h2>
            <h3>Bienvenid@ de vuelta</h3>

            <form className="login-form">
              <div className="textbox">
                <input type="email" placeholder="Nombre de Usuario" />
                <span className="material-symbols-outlined">  </span>
              </div>
              <div className="textbox">
                <input type="password" placeholder="Contraseña" />
                <span className="material-symbols-outlined">  </span>
              </div>
              <button type="submit">Entrar</button>
              <a href="#">Olvidaste tus credenciales?</a>
            </form>
          </div>

        </div>
      </Card>
    </>
  )
}

export default Login