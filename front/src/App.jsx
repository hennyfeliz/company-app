import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css'
import Navbar from './Components/Navbar/Navbar';
import Footer from './Components/Footer/Footer';
import Principal from './Components/Principal/Principal';

function App() {
  return (
    <>
      <Navbar />
      <div className="container">
          <Principal />
      </div>
      <div className="footer fixed-bottom">
        <Footer />
      </div>
    </>
  )
}

export default App
