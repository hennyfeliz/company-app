// import LoginRegisterBodyComponent from "../Login/LoginRegisterBodyComponent"

// import Login from "../Login/Login/Login"
import { Container } from "react-bootstrap"
import "./PrincipalStyle.css"


const Principal = () => {

  const elements = [
    {
      id: 1,
      employeeName: "albert",
      employeeLastname: "feliz",
      company: {
        id: 3,
        companyName: "cocacola",
        creationDate: "2020-01-01T00:00:00"
      },
      contratationDate: "2020-01-01T00:00:00",
      position: {
        id: 2,
        positionName: "dev"
      },
      team: {
        id: 2,
        teamName: "bcc"
      },
      user: {
        id: 4,
        email: "darling@gmail.com",
        password: "darling",
        username: "darling"
      }
    }, {
      id: 1,
      employeeName: "albert",
      employeeLastname: "feliz",
      company: {
        id: 3,
        companyName: "cocacola",
        creationDate: "2020-01-01T00:00:00"
      },
      contratationDate: "2020-01-01T00:00:00",
      position: {
        id: 2,
        positionName: "dev"
      },
      team: {
        id: 2,
        teamName: "bcc"
      },
      user: {
        id: 4,
        email: "darling@gmail.com",
        password: "darling",
        username: "darling"
      }
    }, {
      id: 1,
      employeeName: "albert",
      employeeLastname: "feliz",
      company: {
        id: 3,
        companyName: "cocacola",
        creationDate: "2020-01-01T00:00:00"
      },
      contratationDate: "2020-01-01T00:00:00",
      position: {
        id: 2,
        positionName: "dev"
      },
      team: {
        id: 2,
        teamName: "bcc"
      },
      user: {
        id: 4,
        email: "darling@gmail.com",
        password: "darling",
        username: "darling"
      }
    }, {
      id: 1,
      employeeName: "albert",
      employeeLastname: "feliz",
      company: {
        id: 3,
        companyName: "cocacola",
        creationDate: "2020-01-01T00:00:00"
      },
      contratationDate: "2020-01-01T00:00:00",
      position: {
        id: 2,
        positionName: "dev"
      },
      team: {
        id: 2,
        teamName: "bcc"
      },
      user: {
        id: 4,
        email: "darling@gmail.com",
        password: "darling",
        username: "darling"
      }
    }, {
      id: 1,
      employeeName: "albert",
      employeeLastname: "feliz",
      company: {
        id: 3,
        companyName: "cocacola",
        creationDate: "2020-01-01T00:00:00"
      },
      contratationDate: "2020-01-01T00:00:00",
      position: {
        id: 2,
        positionName: "dev"
      },
      team: {
        id: 2,
        teamName: "bcc"
      },
      user: {
        id: 4,
        email: "darling@gmail.com",
        password: "darling",
        username: "darling"
      }
    },
  ]

  return (
    <>
      {/* <LoginRegisterBodyComponent /> */}
      {/* <Login /> */}
      <Container className="flex d-flex">
        <div className="left_side">
          <div className="title_element">
            <h3 className="title">Personas a contratar</h3>
          </div>

          {
            elements.map((element) => {
              return (
                <>
                  <div className="elements">
                    <span className="user_icon">
                      <ion-icon name="person-circle-outline"></ion-icon>
                    </span>
                    <div className="titles">
                      <span className="name">{`${element.employeeName} ${element.employeeLastname}`}</span>
                      <span className="status">Contratado</span>
                    </div>
                    <span className="user_icon">
                      <ion-icon name="chatbubble-ellipses-outline"></ion-icon>
                    </span>
                  </div>
                  <hr />

                </>
              )
            })
          }

        </div>
        <div className="principal_content">
          <div className="banner">
            <div className="banner_info">
              <h3>Nombre</h3>
            </div>
          </div>
          <div className="principal_content_icon">
            <span className="user_icon_principal">
              <ion-icon name="person-circle-outline"></ion-icon>
            </span>
          </div>
          <div className="principal_content_info flex d-flex">
            <div className="company_people p-3">
              <div className="p-3">
                <span>Compañeros de la empresa</span>
              </div>
              {
                elements.map((element) => {
                  return (
                    <>
                      <div className="elements">
                        <span className="user_icon">
                          <ion-icon name="person-circle-outline"></ion-icon>
                        </span>
                        <div className="titles">
                          <span className="name">{`${element.employeeName} ${element.employeeLastname}`}</span>
                        </div>
                      </div>
                      <hr />
                    </>
                  )
                })
              }
            </div>
            <div className="company_info">

            </div>
          </div>
          {/* <h1>Hola</h1> */}
        </div>
      </Container>
    </>
  )
}


export default Principal