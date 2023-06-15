import LoginRegisterBodyComponent from "../Login/LoginRegisterBodyComponent"

import Login from "../Login/Login/Login"
import PrincipalDashboardCompany from "../Dashboards/PrincipalDashboardCompany"
import { Routes, Route } from "react-router-dom"
import "./PrincipalStyle.css"
// import {CompanyLogin} from "../Login/Login/CompanyLogin/CompanyLogin"


const Principal = () => {



  return (
    <>
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/principal_dashboard_company" element={<PrincipalDashboardCompany />} />
        <Route path="/login_register_body" element={<LoginRegisterBodyComponent />} />
        {/* <Route path="/company_login" element={<CompanyLogin />} /> */}
      </Routes>
    </>
  )
}


export default Principal