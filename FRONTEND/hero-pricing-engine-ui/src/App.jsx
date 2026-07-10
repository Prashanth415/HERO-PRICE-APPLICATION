import { BrowserRouter,Routes,Route } from "react-router-dom";

import Navbar from "./components/Navbar";

import Dashboard from "./pages/Dashboard";
import Components from "./pages/Components";
import Configurations from "./pages/Configurations";
import Pricing from "./pages/Pricing";
import PriceHistory from "./pages/PriceHistory";

function App(){

return(

<BrowserRouter>

<Navbar/>

<Routes>

<Route path="/" element={<Dashboard/>}/>

<Route path="/components" element={<Components/>}/>

<Route path="/configurations" element={<Configurations/>}/>

<Route path="/pricing" element={<Pricing/>}/>

<Route path="/history" element={<PriceHistory/>}/>

</Routes>

</BrowserRouter>

)

}

export default App;