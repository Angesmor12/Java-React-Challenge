import { CustomFetch } from './api/CustomFetch';
import { BrowserRouter as Router, Routes, Route} from "react-router-dom";
import { useEffect, useState } from 'react';
import LoginForm from './pages/LoginForm';
import NotFound from './pages/NotFound';
import ClientInfo from './pages/ClientInfo';
import "./styles/index.css"

function App() {

  return (
  <Router>
    <Routes>
      <Route path="/" element={<LoginForm customFetch={CustomFetch} useState={useState} useEffect={useEffect} />} />
      <Route path="/client/:id" element={<ClientInfo customFetch={CustomFetch} useState={useState} useEffect={useEffect} />} />
      <Route path="/*" element={<NotFound/>} />
    </Routes>
  </Router>
  );
}

export default App;
