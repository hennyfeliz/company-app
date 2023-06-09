import { Card } from "react-bootstrap";
import "./Login.css"
import image from "./avatar.png"
import { useState } from "react";

const Login = () => {
  const [login, setLogin] = useState(0);

  const HandlerLogin = () => {
    setLogin(!login);
  }

  return (
    <>
      <Card classNameName="m-5">
        <div className="w-75 container">
          <div className="login">
            <div className="avatar">
              <img src={image} />
            </div>
            {
              login
                ?
                <div>
                  <h2>Usuario existente</h2>
                  <h3>Bienvenid@ de vuelta</h3>
                </div>
                :
                <div>
                  <h2>Nuevo usuario</h2>
                  <h3>Bienvenido por primera vez</h3>
                </div>
            }
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
              {login
                ? <button type="button" className="w-50 h-100 btn btn-default" onClick={HandlerLogin}>Registrar</button>
                : <button type="button" className="w-50 h-100 btn btn-default" onClick={HandlerLogin}>Logear</button>}
            </form>
          </div>

        </div>

      </Card>
    </>
  )
}

export default Login