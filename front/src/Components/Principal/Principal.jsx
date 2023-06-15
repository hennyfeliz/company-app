import LoginRegisterBodyComponent from "../Login/LoginRegisterBodyComponent"

import Login from "../Login/Login/Login"
import PrincipalDashboardCompany from "../Dashboards/PrincipalDashboardCompany"
import { Routes, Route } from "react-router-dom"
import "./PrincipalStyle.css"


const Principal = () => {



  return (
    <>
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/principal_dashboard_company" element={<PrincipalDashboardCompany />} />
        <Route path="/login_register_body" element={<LoginRegisterBodyComponent />} />
      </Routes>
    </>
  )
}


export default Principal