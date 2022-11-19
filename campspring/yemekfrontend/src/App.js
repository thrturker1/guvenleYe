import './App.css';
import React, { useState } from 'react'
import Appbar from './components/Appbar'
import HomePage from './pages/HomePage';


function App() {
  return (
    <div className="App">
      
      <AdminPage/>
      <>
      <input type="text"/> 
      <button>Addtodo</button>
      <button>cleartodo</button>
      </>
    </div>
  );
}

export default App;
