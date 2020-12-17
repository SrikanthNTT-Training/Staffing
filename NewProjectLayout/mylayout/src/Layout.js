
import React,{Component} from 'react';
import { NavLink ,Switch ,Route } from 'react-router-dom';
import './Layout.css';



class Layout extends Component{
  
    render() {
        return (
            <div>
                <header>
                    <nav className='Navbar'>
                        <ul className="nav-menu">     
                            <li>
                                <NavLink to='/staffing'>Staffing</NavLink>
                            </li>
                            <li>
                                <NavLink to='/contract'>Contract</NavLink>
                            </li>
                            <li>
                                <NavLink to='/employee'>Employee</NavLink>
                            </li>
                           
                        </ul>
                    </nav>
                    <div className="sidenav">
                    <nav >
                        <ul>     
                            <li>
                                <NavLink to='/about'>About</NavLink>
                            </li>
                            <li>
                                <NavLink to='/contact-us'>Contact Us</NavLink>
                            </li>
                        </ul>
                    </nav>
                    </div>

                </header>
                <Switch>
                    <Route path='/' exact  />
                    <Route path='/staffing' exact  />
                    <Route path='/contract'  />
                    <Route path='/employee'  />
                    <Route path='/about' />
                    <Route path='/contact-us' />

                    {/* <Route path='/Help Support' component={Helpsupport} /> */}

                </Switch>

              
            </div>

        );
    }
}

export default Layout;