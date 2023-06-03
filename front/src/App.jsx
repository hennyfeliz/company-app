import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css'
import Navbar from './Components/Navbar/Navbar';
import Footer from './Components/Footer/Footer';

function App() {
  return (
    <>
      <Navbar />
      <div className="container">
        <h1 className='d-2'>Hola</h1>
      </div>
      <div className="footer fixed-bottom">
        <Footer />
      </div>
    </>
  )
}

export default App
