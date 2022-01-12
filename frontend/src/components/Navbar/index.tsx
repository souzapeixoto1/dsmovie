import { ReactComponent as GitHubIcon } from 'assets/img/gitimage.svg'
import './style.css';

function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/souzapeixoto1/souzapeixoto1">
                        <div className = "dsmovie-contact-container">
                            <GitHubIcon/>
                            <p className = "dsmovie-contact-link">/souzapeixoto1</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );

}

export default Navbar;