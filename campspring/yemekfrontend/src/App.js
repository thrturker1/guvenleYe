import './App.css';
import Appbar from './components/Appbar';
import Home from "./Pages/HomePage"
import Dashboard from "./components/Dashboard";

function App() {
  return (
    <div className="App">
      <Appbar/>
      <Dashboard/>
    </div>
  );
}

export default App;
