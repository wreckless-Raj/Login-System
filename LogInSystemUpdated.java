/*Question 2
        Suppose you want to create a login system for an application. Users can register in your system by
        providing name, email and password. Also, user can login by providing correct email and password.
        1. Create the GUI for registering users. The GUI should contain fields for input name, email and
        password.
        2. The login data of all the users should be stored in a file.
        Provide a register button in the registration GUI. Clicking the register button will append the
        data entered in the GUI input fields to a file.
        3. Create the GUI for log-in. (The GUI should contain mechanisms to input login information and
        show result)
        4. If a user provides correct email and password (stored in the file), show “Login Successful”, else
        show “Login Unsuccessful”
        [For appending to an existing file, create the FileWriter as follows: new FileWriter(file, true).]
*/








import java.awt.event.ActionEvent;              //Name: Raj Shekhar Karmaker
import java.awt.event.ActionListener;          //ID: 011 193 149
import java.nio.Buffer;                                                         //file.txt && out.txt for reference
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import javax.swing.*;
import java.io.*;
class User{
    String name;
    String email;
    String password;

    User(String name, String email, String password){
        name= this.name;
        email= this.email;
        password= this.password;
    }
}

public class LogInSystemUpdated {
    public static void write(String s, File f) throws IOException {
        FileWriter fw = new FileWriter(f, true);
        fw.write(s);
        fw.close();
    }
    public static void main(String[] args) throws IOException {
        JFrame f= new JFrame("Login System");
        f.setSize(600,500);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        //1  User can input the info of a particular person
        JPanel p1= new JPanel();                    //Follow the format below to write input
        JLabel l1= new JLabel("Name:");      //name email password
        JTextField t1= new JTextField(15);
        JLabel l2= new JLabel("email: ");
        JTextField t2= new JTextField(15);
        JLabel l3= new JLabel("password: ");
        JTextField t3= new JTextField(10);
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();
        p5.setSize(200,100);
        JLabel l4= new JLabel("email: ");
        JTextField t4= new JTextField(20);
        JLabel l5=new JLabel("password: ");
        JTextField t5= new JTextField(20);
        JTextField tf= new JTextField(50);
        tf.setEditable(false);


        ActionListener obj= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //t2.setText(t1.getText());



                try{
                    File f= new File("C:\\Users\\ASUS\\IdeaProjects\\LabFinalAssignment2\\out.txt");
                    write(t1.getText()+" ",f);
                    write(t2.getText()+" ",f);
                    write(t3.getText()+" ",f);
                    //write("\n",f);




                    // }

                    //fw = new FileWriter("file.txt", true);
                    //fw.write(t1.getText());
                    //pw.println(t1.getText());

                    //FileReader reader= new FileReader(filename);


                    //pw.println();

                    //t2.setText("out.txt");
                    //r.close();
                    //pw.close();
                    //fw.close();

                }catch(FileNotFoundException ex){
                    ex.printStackTrace();
                }catch(IOException ex){
                }
            }
        };


        ActionListener obj1= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String searchWord1=t4.getText();        //email
                String searchWord2=t5.getText();        //password
                File output= new File("C:\\Users\\ASUS\\IdeaProjects\\LabFinalAssignment2\\out.txt");
                //FileReader fr= null;
                //if(t3.getText()==t2.requestFocus())
                //Path path = Paths.get("C:\\Users\\ASUS\\IdeaProjects\\LabFinalAssignment2\\out.txt");
                User[] user=new User[10];
                try{
                    //BufferedReader r= new BufferedReader(new FileReader(file));
                    //PrintWriter pw= new PrintWriter(new File("C:\\Users\\ASUS\\IdeaProjects\\LabFinalAssignment\\file1.txt"));
                    //FileWriter fw = null;
                    //pw.println();
                    //String s= r.readLine();
                    // while(s!=null){
                    //String str[]=s.split(" ");
                    //String o= t1.getText();
                    //String id1= str[0];
                    //String id2=str[1];
                    //String id3=str[2];
                    //String id4=str[3];
                    //String id5=str[4];
                    //String id6=str[5];
                    //String id7=str[6];
                    //s=r.readLine();
                    //Civilian c= new Civilian(t1.getText());
                    //pw.println(id1+" "+id2+" "+id3+" "+id4+" "+id5+" "+id6+" "+id7);
                    FileReader fr = new FileReader(output);
                    //LineNumberReader lr=new LineNumberReader(fr);
                    //fr=new FileReader("C:\\Users\\ASUS\\IdeaProjects\\LabFinalAssignment\\out.txt");
                    BufferedReader br= new BufferedReader(fr);
                    String s= br.readLine();
                    //if(s.contains(searchWord))
                    //t4.setText(s);
                    //String s= br.readLine();
                    //long lines = Files.lines(path).count();
                    //int count=0;
                   // int countless=0;
                    //countless=count-countless;
                                                                //number of lines
                    while(s!=null) {

                        String str[]=s.split(" ");
                        //String o= t1.getText();
                            String name = str[0];
                            String email = str[1];
                            String password = str[2];


                            //count++;
                        /*for(int i=0; i<10; i++ ) {
                            User user=new User(name,email,password);
                           // u[i]=user;
                            if(i%2==1)
                            if (u[i].email.equals(searchWord1)){

                            if(u[i].password.equals(searchWord2)) {
                                tf.setText("Login Successful!");
                                //if (count - (count - 1) == 1)
                            }
                            }
                            else
                                tf.setText("Login Unsuccessful!");

                        }*/
                            if (searchWord1.equals(email) && searchWord2.equals(password)) {
                                tf.setText("Login Successful!");
                                break;
                            } else
                                tf.setText("Login Unsuccessful!");



                        s= br.readLine();


                    }

                    /*for(i=count; i<0; i--) {
                        String textArray[]= new String[i];

                        t4.setText(textArray[i]);
                    }*/
                    br.close();
                    fr.close();
                    //lr.close();

                }catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }catch (NullPointerException ex){
                    //tf.setText("Login Unsuccessful!");
                }

            }
        };

                /*try{
                    FileReader fr = new FileReader("out.txt");
                    //fr=new FileReader("C:\\Users\\ASUS\\IdeaProjects\\LabFinalAssignment\\out.txt");
                    BufferedReader br= new BufferedReader(fr);
                    String s= br.readLine();
                    while(s!=null){
                        if((searchWord1.equals(t4.getText()) && searchWord2.equals(t5.getText())))
                            tf.setText("Login Successful!");
                        else
                            tf.setText("Login Unsuccessful!");
                        s= br.readLine();
                    }
                    fr.close();
                    br.close();
                }catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
        };*/


        JButton b1= new JButton( "Register");
        b1.addActionListener(obj);
        JButton b2= new JButton("Login");
        b2.addActionListener(obj1);
        //JButton b3= new JButton("Search");
        //b3.addActionListener(obj2);
        p5.add(tf);
        p4.add(b2);
        p3.add(l4); p3.add(t4); p3.add(l5);  p3.add(t5);
        p2.add(b1);
        p1.add(l1); p1.add(t1); p1.add(l2); p1.add(t2); p1.add(l3); p1.add(t3); p1.add(p2); p1.add(p3); p1.add(p4); p1.add(p4); p1.add(p5);

        f.setContentPane(p1);
        f.setVisible(true);
    }
}