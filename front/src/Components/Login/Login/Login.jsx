import { Form, Button, Card } from "react-bootstrap";
import "./Login.css"

const Login = () => {
  return (
    <>
    <Card>
    <div className="w-75 container">
      <h1 className="t-body-styles">Creando nuevo participante</h1>
      <Form className="t-body-styles">
        {/* CEDULA */}
        <Form.Group className="mb-3" controlId="cedula">
          <Form.Label>Cedula del participante</Form.Label>
          <Form.Control
            type="text"
            // ref={post_cedula}
            placeholder="Introduzca la cedula del participante"
          />
        </Form.Group>
        {/* NOMBRE */}
        <Form.Group className="mb-3" controlId="nombre">
          <Form.Label>Nombre</Form.Label>
          <Form.Control
            type="text"
            // ref={post_nombre}
            placeholder="Introduzca el nombre del participante"
          />
        </Form.Group>

        {/* APELLIDO */}
        <Form.Group className="mb-3" controlId="apellido">
          <Form.Label>Apellido</Form.Label>
          <Form.Control
            type="text"
            // ref={post_apellido}
            placeholder="Introduzca el apellido del participante"
          />
        </Form.Group>

        {/* CODIGO DEL CURSO */}
        <Form.Label>Curso</Form.Label>
        <div className="App">
          <div className="form-group">
            {/* <Form.Select ref={post_curso}>
              {cursos.map((curso) => {
                return (
                  <option key={curso.codigoCurso} value={curso.codigoCurso}>
                    {`${curso.codigoCurso} - ${curso.descripcion}`}
                  </option>
                );
              })}
            </Form.Select> */}
          </div>
        </div>
        <br />
{/*         <Form.Group className="mb-3" controlId="curso">
          <Form.Label>Codigo del curso</Form.Label>
          <Form.Control
            type="text"
            ref={post_curso}
            placeholder="Introduzca el codigo del curso"
          />
        </Form.Group> */}

        {/* CODIGO DE BARRA */}
        <Form.Group className="mb-3" controlId="codigoBarra">
          <Form.Label>Codigo de barra</Form.Label>
          <Form.Control
            type="text"
            // ref={post_codigoBarra}
            placeholder="Introduzca el codigo de barra"
          />
        </Form.Group>

        {/* BOTON */}
        <Button variant="primary" onClick={() => {
          alert("funciona")
        }} className="w-100">
          Crear participante
        </Button>
      </Form>

    </div>
    </Card>
    </>
  )
}

export default Login