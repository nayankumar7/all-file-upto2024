import { useState } from 'react'

import './App.css'
import Hello from './hello'
import 'bootstrap/dist/css/bootstrap.min.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <h1>Hello w</h1>
      <br />
      <Hello/>
    </>
  )
}

export default App
