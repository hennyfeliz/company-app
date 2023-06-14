// import LoginRegisterBodyComponent from "../Login/LoginRegisterBodyComponent"

import Login from "../Login/Login/Login"
// import PrincipalDashboardCompany from "../Dashboards/PrincipalDashboardCompany"
import { Routes, Route } from "react-router-dom"
import "./PrincipalStyle.css"


const Principal = () => {



  return (
    <>
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/company_dashboard" element={<Login />} />
        {/* <LoginRegisterBodyComponent /> */}
        {/* <Login /> */}
        {/* <PrincipalDashboardCompany /> */}
      </Routes>
    </>
  )
}


export default Principal