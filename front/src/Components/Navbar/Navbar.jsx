
import {Link} from "react-router-dom"
import "./NavbarStyles.css"

const Navbar = () => {
  return (
    <nav className="navbar navbar-expand-lg navbar-light bg-light">
      <div className="buttons-space container-fluid container">
        <Link to={"/"}>
          <a className="navbar-brand">Manejador de compañias</a>
        </Link>
        <div className="top-buttons collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav me-auto mb-2 mb-lg-0">
            <li className="nav-item">
              <Link to={"/company"}>
                <a className="nav-link active">Company</a>
              </Link>
            </li>
            <li className="nav-item">
              <Link to={"/employee"}>
                <a className="nav-link">Employees</a>
              </Link>
            </li>
{/*             
            <li className="nav-item">
              <a className="nav-link disabled" href="#" tabIndex="-1" aria-disabled="true">Disabled</a>
            </li> */}
          </ul>
          <form className="d-flex">
            <div>
              <div className="nav-item dropdown">
                <a className="nav-link" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  <span className="user_icon">
                    <ion-icon name="person-circle-outline"></ion-icon>
                  </span>
                </a>
                <ul className="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a className="dropdown-item" href="#">Action</a></li>
                  <li><a className="dropdown-item" href="#">Another action</a></li>
                  <li><hr className="dropdown-divider" /></li>
                  <li><a className="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </div>
            </div>
          </form>
        </div>
      </div>
    </nav>
  )
}

export default Navbar