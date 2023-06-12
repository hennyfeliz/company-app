// import LoginRegisterBodyComponent from "../Login/LoginRegisterBodyComponent"

// import Login from "../Login/Login/Login"
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
    },    {
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
    },    {
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
                    <span className="name">{`${element.employeeName} ${element.employeeLastname}` }</span>
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
    </>
  )
}


export default Principal