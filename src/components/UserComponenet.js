import React from 'react';
import UserServices from '../services/UserServices';

class UserComponent extends React.Component{
   

    constructor(props){
        super(props)
        this.state={
            user:[]
        }
    }

    componentDidMount(){

        UserServices.getUsers().then((response) =>
         {
            console.log(response)
            this.setState({user: response.data})
            
        });
    }
    render(){
        return(
            <div >

            <h1 className = "text-center"> STUDENTS LIST</h1>
            <table className = "table table-striped">
                <thead>
                    <tr>
                        <td> STUD ID</td>
                        <td> STUD FISRT NAME</td>
                        <td> STUD LAST NAME</td>
                        <td> STUD EMAIL ID</td>
                        </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.user.map(
                                    user =>
                                    <tr key= {user.id}>                                    
                                    <td> {user.id} </td>
                                    <td>{user.firstname}</td>
                                    
                                    <td>{user.lastname}</td>
                                    
                                    <td>{user.email}
                                    </td>
                                    </tr>
                                )
                                   

                                    
                                   
                                    
                                
                                
                            }
                        </tbody>
                        </table>
                        </div>

        )
            


        
       
    }
}
export default UserComponent