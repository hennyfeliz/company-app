import { Container } from "@mui/material";
import { Routes, Route } from "react-router-dom";
import Login from "./Login/Login";

const LoginRegisterBodyComponent = () => {
  return (
    <>
      <Container>
        <Routes>
          <Route path="/login" element={<Login />} />
        </Routes>
      </Container>
    </>
  )
}


export default LoginRegisterBodyComponent