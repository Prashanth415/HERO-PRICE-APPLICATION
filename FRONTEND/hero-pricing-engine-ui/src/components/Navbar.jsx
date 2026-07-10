import { Link } from "react-router-dom";

function Navbar(){

    return(

<nav className="navbar navbar-expand-lg navbar-dark bg-dark">

<div className="container">

<Link className="navbar-brand" to="/">

Hero Pricing Engine

</Link>

<div>

<Link className="btn btn-outline-light mx-1" to="/">Dashboard</Link>

<Link className="btn btn-outline-light mx-1" to="/components">Components</Link>

<Link className="btn btn-outline-light mx-1" to="/configurations">Configurations</Link>

<Link className="btn btn-outline-light mx-1" to="/pricing">Pricing</Link>

<Link className="btn btn-outline-light mx-1" to="/history">History</Link>

</div>

</div>

</nav>

)

}

export default Navbar;