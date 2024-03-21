import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import Adminloginform from './pages/admin/adminlogin'
import UserPage from './pages/user/userpage'
import UserLoginForm from './pages/user/userlogin'
import Plan from './pages/user/Plan'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div>
      <Router>
            <Routes>
                <Route path="/user-plan" element={<Plan/>}></Route>
            </Routes>
        </Router>
     </div>
    </>
  )
}

export default App



