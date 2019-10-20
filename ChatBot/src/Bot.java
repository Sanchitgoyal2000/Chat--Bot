import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;//chat between user and bot
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Bot extends JFrame
{
	
	 JTextArea Chatarea;//to represent the chat
	 JTextField chatbox;// to type the message
	JScrollPane scroll;
	public Bot()
	{
		JFrame frame=new JFrame();
		Chatarea = new JTextArea();
		chatbox = new JTextField();
		
		

	    Chatarea.setSize(500,400);  // width and height
		Chatarea.setLocation(2,2);
		
		scroll = new JScrollPane (Chatarea, 
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		  //The setVisible() method in Java makes 
	      //the GUI component visible to the user 
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(550,600);
		frame.setTitle("Chat Bot");
		frame.add(Chatarea);
		frame.add(chatbox);
		
		chatbox.setSize(540,30);
		chatbox.setLocation(2,500);
		
		
		Chatarea.setBackground(Color.ORANGE);
		
		 Font font = new Font("Helvetica", Font.BOLD, 20);
         Chatarea.setFont(font);
         Chatarea.setForeground(Color.BLACK);
         
		chatbox.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				String gtext=chatbox.getText();
		         Chatarea.append("YOU: " +gtext+"\n");
		         chatbox.setText("");
		        
		        if(gtext.contains("hii"))
		        {
		        	bot("holla!!");
		        }
		        else if(gtext.contains("hello"))
		        {
		        	bot("hii");
		        }
		        else if(gtext.contains("how are u"))
		        {
		        	bot("I m fine!How are u?");
		        }
		        else if(gtext.contains("what you are doing"))
		        {
		        	bot("Chatting !And u?");
		        }
		        else if(gtext.contains("your name"))
		        {
		        	bot("Bot! and yours?");
		        }
		        else if(gtext.contains("fine"))
		        {
		        	bot("Good!");
		        }
		        else if(gtext.contains("screen"))
		        {
		        	bot("Yes Chat Box");
		        }
		        else if(gtext.contains("friend"))
		        {
		        	bot("Friends are good!");
		        }
		        else if(gtext.contains("by"))
		        {
		        	bot("By! Have a nice day");
		        }
		        else if(gtext.contains("Good Luck"))
		        {
		        	bot("Same to u!!!");
		        }
		        else
		        {
		        	bot("OOOPs! Cant Understand");
		        }
			}
		}
   );
		
	}
	
	 void bot(String string)
	{
		Chatarea.append("BOT:"+string+"\n");
	}

	public static void main(String args[])
  {
	new Bot();  
  }
}