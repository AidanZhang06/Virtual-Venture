import React from 'react'
import {Homepage, Communication} from '../components'
import icon from '../images/Untitled drawing (1).png'
import {HomeOutlined, MessageOutlined} from '@ant-design/icons';
import {Routes, Route, Link} from 'react-router-dom';
import {Layout, Typography, Menu, Avatar, Space} from 'antd';

const { Header, Content, Footer } = Layout;

export default function InvestorNavbar() {
    return (
        <div className="main">
        	<Layout>
          		<Header className="header-container">
            		<div className="nav-container">
              			<div className="logo-container">
                			<img src={icon} style={{maxHeight: "6vh"}} />
                			<Typography.Title level={2} className="logo">
                  				<Link to="/">Virtual Venture</Link>
                			</Typography.Title>
              			</div>
              			<Menu theme="dark" mode="horizontal">
                			<Menu.Item icon={<HomeOutlined />} key={1}>
                  				<Link to="/">Home</Link>
                			</Menu.Item>
                			<Menu.Item icon={<MessageOutlined />} key={2}>
                  				<Link to="/communication">Communication</Link>
                			</Menu.Item>
              			</Menu>
            		</div>
          		</Header>
          		<div className="routes">
            		<Routes>
              			<Route path="/" element={<Homepage />}/>
              			<Route path="/communication" element={<Communication />}/>
            		</Routes>
          		</div>
        	</Layout>
        	<div className="footer">
          		<Typography.Title level={5} style={{color: 'white', textAlign: 'center'}}>
            		Virtual Venture <br/>
            		All Rights Reserved
          		</Typography.Title>
          		<Space>
            		<Link to="/">Home</Link>
            		<Link to="/communication">Communication</Link>
          		</Space>
        	</div>
      	</div>
    )
}
