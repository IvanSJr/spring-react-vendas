import BarChart from "components/BarChart";
import DataTable from "components/datatable/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/footer/Footer";
import NavBar from "components/navbar/NavBar";

const Home = () => {
    return (
        <>
            <div className="container">
                <NavBar></NavBar>
                <h1 className="text-primary py-3">Dashboard de vendas</h1>
                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="text-secondary text-center">Taxa de sucesso</h5>
                        <BarChart></BarChart>
                    </div>
                    <div className="col-sm-6">
                        <h5 className="text-secondary text-center">Todas as vendas</h5>
                        <DonutChart></DonutChart>
                    </div>
                </div>
                <div className="py-3">
                    <h2 className="text-primary">Todas Vendas</h2>
                </div>
                <DataTable></DataTable>
            </div>
            <Footer></Footer>
        </>
    );
}

export default Home;