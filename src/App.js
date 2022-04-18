import './App.css';
import React from 'react'
import InvestorNavbar from './components/InvestorNavbar'



function App() {
    return (
        <div className="app">
            <div className="routes">
            	<Routes>
              		<Route path="/" element={<Homepage />}/>
              		<Route path="/communication" element={<Communication />}/>
            	</Routes>
          	</div>
            <InvestorNavbar />
        </div>
    );
}

export default App;
