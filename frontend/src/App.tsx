import NavBar from "components/navbar/NavBar";
import Footer from "components/footer/Footer";
import DataTable from "components/datatable/DataTable";

function App() {
    return (
        <>
        <div className="container">
            <NavBar></NavBar>
            <h1 className="text-primary">Olá Mundo!</h1>
            <DataTable></DataTable>
        </div>
        <Footer></Footer>
        </>
    );
}

export default App;