import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css'
import Navbar from './Components/Navbar/Navbar';
import Footer from './Components/Footer/Footer';
import Principal from './Components/Principal/Principal';
import { BrowserRouter } from 'react-router-dom';

function App() {
  return (
    <>
      <BrowserRouter>
        <Navbar />
        <div className="container">
          <Principal />
        </div>
        <div className="footer fixed-bottom">
          <Footer />
        </div>
      </BrowserRouter>
    </>
  )
}

export default App
