/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author cwnnawulezi
 */
public class WomensHealth extends JFrame implements ActionListener {

    JLabel assault = new JLabel("");
    JLabel assInfo = new JLabel("Sexual Assault");
    JLabel types = new JLabel("Dealing with Depression, Anxiety, or Bipolar Disorder");
    JButton info = new JButton("General Information");
    JButton stories = new JButton("Stories");
    JButton help = new JButton("Seek Help");
    JLabel stratagies = new JLabel("Strategies");
    JLabel Depression = new JLabel();
    JLabel Anxiety = new JLabel();
    JLabel Bipolar = new JLabel();
    JLabel strat = new JLabel("");
    JMenuBar menu = new JMenuBar();
    JButton assaultTab = new JButton("Assault");
    JButton Stratages = new JButton("Strategies");
    JButton home = new JButton("Home");
    JButton quote = new JButton("Quotes");
    String infotab, storiestab, helptab, statement, anxiety1, bipolar1, depression1;
    JLabel quotes = new JLabel("How are you feeling?");
    JButton stressed = new JButton("Stressed");
    JButton anxious = new JButton("Anxious");
    JButton discouraged = new JButton("Discouraged");
    JButton frustrated = new JButton("Frustrated");
    JButton uncomfortable = new JButton("Uncomfortable");
    String Inspiration, stressedQuote, anxiousQuote, discouragedQuote, frustratedQuote, uncomfortableQuote;
    JLabel title = new JLabel("WomenCare");
    JLabel mission = new JLabel();
    JLabel jLabel1 = new JLabel();
    Image icon;

    public WomensHealth(String homee, int homeee) throws IOException {
    //icon = ImageIO.read(getClass().getResource("girl.jpg"));  
    
     //jLabel1.imageUpdate(icon, 5, 40, 40, 40, 5);
     statement = "<html>WomenCare is a program designed to address the importance of a woman’s physical and mental health. It includes strategies for different mental episodes of distress, inspirational quotes that are based on the mood of the user whether it is for a time of need or for an uplifting moment, and a page dedicated to addressing sexual assault and contact services.";
     mission.setText(statement);
     setSize(1000, 800);
        java.awt.Container pane = getContentPane();
        javax.swing.BoxLayout box = new javax.swing.BoxLayout(pane, javax.swing.BoxLayout.Y_AXIS);
        setLayout(box);
        pane.setBackground(Color.PINK);
        pane.removeAll();
        menu.add(home);
        menu.add(Stratages);
        menu.add(assaultTab);
        menu.add(quote);
        pane.add(menu);
        pane.add(title);
        pane.add(mission);
        pane.add(jLabel1);
        
        title.setFont(new Font("Helvetica", Font.BOLD, 18));
        QuoteListener listener = new QuoteListener();
        home.addActionListener(this);
        Stratages.addActionListener(this);
        assaultTab.addActionListener(this);
        quote.addActionListener(this);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible(true);

      }
    
    
    public WomensHealth() {
      
        
        setSize(1000, 800);
        java.awt.Container pane = getContentPane();
        javax.swing.BoxLayout box = new javax.swing.BoxLayout(pane, javax.swing.BoxLayout.Y_AXIS);
        setLayout(box);
        pane.setBackground(Color.GRAY);
        pane.removeAll();
        menu.add(home);
        menu.add(Stratages);
        menu.add(assaultTab);
        menu.add(quote);
        pane.add(menu);
        pane.add(assault);
        pane.add(assInfo);
        pane.add(info);
        pane.add(stories);
        pane.add(help);
        pane.add(assault);

        infotab = "<html>Sexual assault can take many different forms, but one thing remains the same: it’s never the victim’s fault. The term sexual assault refers to sexual contact or behavior that occurs without explicit consent of the victim. Sexual assault is basically an umbrella term that includes sexual activities such as rape, fondling, and attempted rape.";
        storiestab = "<html>Katie MacPherson, 20, a student at Kent State University in Ohio, said she was heading to a concert one evening when a drunk friend attacked her inside a car. She was in the front passenger seat. Suddenly he lunged forward, MacPherson recalled, grabbed her head and hair violently and tried to kiss her. “Get your hands off me!” she yelled. The struggle continued until MacPherson managed to open the door and flee. “Immediately I knew,” she said. “That was sexual assault.” She didn’t report the attack to authorities. But through an intermediary, she told the man’s fraternity. “I wanted him to get a wake-up call,” she said. “I never expected that from my friend.”"
                + "<html>A 21-year-old at a public university in the Southeast who participated in a poll said she was raped by a male student who escorted her out of a nightclub after she suddenly became woozy and separated from a group of friends. Someone, she suspects, had slipped a drug into her rum drink. “In the morning, I woke up and my lip was so swollen,” the woman said. “I just remember sobbing and sobbing and sobbing the next day. You learn a lot of lessons.”\n"
                + "\n";
        helptab = "<html>Call 800.656.HOPE (4673) to be connected with a trained staff member from a sexual assault service provider in your area. Calling the National Sexual Assault Hotline gives you access to a range of free services including: Confidential support from a trained staff member, support finding a local health facility that is trained to care for survivors of sexual assault and offers services like sexual assault forensic exams, someone to help you talk through what happened, local resources that can assist with your next steps toward healing and recovery, referrals for long term support in your area, information about the laws in your community, and basic information about medical concerns. ";
        
        info.setBackground(Color.blue);

        assInfo.setFont(new Font("Helvetica", Font.BOLD, 18));

        info.setBackground(Color.white);

        stories.setBackground(Color.white);

        help.setBackground(Color.white);

        QuoteListener listener = new QuoteListener();

        info.addActionListener(this);
        stories.addActionListener(this);
        help.addActionListener(this);
        home.addActionListener(this);
        Stratages.addActionListener(this);
        assaultTab.addActionListener(this);
        quote.addActionListener(this);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public WomensHealth(int sratages) {
        
   
        setSize(1000, 800);
        java.awt.Container pane = getContentPane();
        javax.swing.BoxLayout box = new javax.swing.BoxLayout(pane, javax.swing.BoxLayout.Y_AXIS);
        setLayout(box);
        pane.setBackground(Color.YELLOW);
        pane.removeAll();
        menu.add(home);
        menu.add(Stratages);
        menu.add(assaultTab);
        menu.add(quote);
        pane.add(menu);
        pane.add(strat);
        pane.add(types);
        pane.add(Depression);
        pane.add(Anxiety);
        pane.add(Bipolar);
        depression1 = "<html>Dealing with depression requires action, but taking action when you’re depressed can be hard. Sometimes, just thinking about the things you should do to feel better, like exercising or spending time with friends, can seem exhausting or impossible to put into action. Taking the first step is always the hardest. But going for a walk or getting up and dancing to your favorite music, for example, is something you can do right now. And it can substantially boost your mood and energy for several hours—long enough to put a second recovery step into action, such as preparing a mood-boosting meal or arranging to meet an old friend. By taking the following small but positive steps day by day, you’ll soon soon lift the heavy fog of depression and find yourself feeling happier, healthier, and more hopeful again.";
        anxiety1="<html>When anxiety flares, take a time out and think about what it is that is making you so nervous. Anxiety is typically experienced as worrying about a future or past event. Regardless of what you are worried about, a big part of the problem is that you are not being mindful of the present moment. Anxiety loses its grip when you clear your mind of worry and bring your awareness back to the present. The next time your anxiety starts to take you out of the present, regain control by sitting down and taking a few deep breaths. Simply stopping and breathing can help restore a sense of personal balance and bring you back to the present moment. Practice simple breathing techniques, listening to music, going for a walk, and talking with friends.";
        bipolar1="<html>Living well with bipolar disorder requires certain adjustments. No matter how down or out of control you feel, it’s important to remember that you’re not powerless when it comes to bipolar disorder. Beyond the treatment you get from your doctor or therapist, there are many things you can do to reduce your symptoms and stay on track, including educating yourself about bipolar disorder, surrounding yourself with people you can count on, and leading a healthy “wellness” lifestyle. With good coping skills and a solid support system, you can keep the symptoms of bipolar disorder in check, maintain your balance, and live fully and productively.";
        
       

        home.addActionListener(this);
        Stratages.addActionListener(this);
        assaultTab.addActionListener(this);
        help.addActionListener(this);
        types.setFont(new Font("Helvetica", Font.BOLD, 18));
        quote.addActionListener(this);
        Depression.setText(depression1);
        Anxiety.setText(anxiety1);
        Bipolar.setText(bipolar1);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
      
public WomensHealth(String homem) {
        
        
        setSize(1000, 800);
        java.awt.Container pane = getContentPane();
        javax.swing.BoxLayout box = new javax.swing.BoxLayout(pane, javax.swing.BoxLayout.Y_AXIS);
        setLayout(box);
        pane.setBackground(Color.PINK);
        pane.removeAll();
        menu.add(home);
        menu.add(Stratages);
        menu.add(assaultTab);
        menu.add(quote);
        pane.add(menu);
        pane.add(title);
        pane.add(mission);
        
      assault.setFont(new Font("Helvetica", Font.BOLD, 18));
        home.addActionListener(this);
        Stratages.addActionListener(this);
        assaultTab.addActionListener(this);
        quote.addActionListener(this);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    public WomensHealth(double num) {
        
       
        setSize(1000, 800);
        java.awt.Container pane = getContentPane();
        javax.swing.BoxLayout box = new javax.swing.BoxLayout(pane, javax.swing.BoxLayout.Y_AXIS);
        setLayout(box);
        pane.removeAll();
        menu.add(home);
        menu.add(Stratages);
        menu.add(assaultTab);
        
        menu.add(quote);
        pane.add(menu);
        pane.add(assault);
        pane.setBackground(Color.WHITE);
        stressedQuote = "<html>”Stress is something that’s created in the mind, basically. It’s how we look at things. So our greatest defense against stress is the ability to change our minds; to change our thinking.” — Goldie Hawn<html>";
        anxiousQuote = "<html>”I will breathe. I will think of solutions, I will not let my worry control me. I will not let my stress level break me. I will simply breathe. And it will be okay. Because I don’t quit.”— Shayn McClemmon";
        discouragedQuote = "<html>”Ships don’t sink because of the water around them; ships sink because of the water that gets in them. Don’t let what’s happening around you get inside you and weigh you down.” — Unknown";
        
        frustratedQuote = "<html>”You've done it before and you can do it now. See the positive possibilities. Redirect the substantial energy of your frustration and turn it into positive, effective, unstoppable determination.” — Ralph Marston";

        uncomfortableQuote = "<html>”Be willing to step outside your comfort zone once in a while; take the risks in life that seem worth taking. The ride might not be as predictable if you'd just planted your feet and stayed put, but it will be a heck of a lot more interesting.” — Edward Whitacre, Jr.";
       
        quotes.setFont(new Font("Helvetica", Font.BOLD, 18));

        stressed.setBackground(Color.red);

        anxious.setBackground(Color.blue);

        discouraged.setBackground(Color.yellow);

        frustrated.setBackground(Color.green);

        uncomfortable.setBackground(Color.pink);
        
        ButtonGroup group = new ButtonGroup();

        group.add(stressed);
        group.add(anxious);
        group.add(discouraged);

        group.add(frustrated);
        group.add(uncomfortable);

        QuoteListener listener = new QuoteListener();
        stressed.addActionListener(this);
        anxious.addActionListener(this);
        discouraged.addActionListener(this);
        frustrated.addActionListener(this);
        uncomfortable.addActionListener(this);
        home.addActionListener(this);
        Stratages.addActionListener(this);
        assaultTab.addActionListener(this);
        quote.addActionListener(this);

        add(quotes);
        add(stressed);
        add(anxious);
        add(discouraged);

        add(frustrated);
        add(uncomfortable);
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent thing) {

        Object source = thing.getSource();
        if(source == home) {
            try {
                WomensHealth prog = new WomensHealth("dog", 6);
            } catch (IOException ex) {
                Logger.getLogger(WomensHealth.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(source == info) {
            assault.setText(infotab);
        } else if (source == stories) {
            assault.setText(storiestab);
        } else if (source == help) {
            assault.setText(helptab);
        } else if (source == Stratages) {
            WomensHealth prog = new WomensHealth(5);
        } else if (source == stressed) {
            quotes.setText(stressedQuote);
        } else if (source == anxious) {
            quotes.setText(anxiousQuote);
        } else if (source == discouraged) {
            quotes.setText(discouragedQuote);
        } else if (source == frustrated) {
            quotes.setText(frustratedQuote);
        } else if (source == uncomfortable) {
            quotes.setText(uncomfortableQuote);
        } else if(source == assaultTab){
            WomensHealth prog = new WomensHealth();  
        } else if(source == quote){
            WomensHealth prog = new WomensHealth(5.5);
        }
        

    }

    public static void main(String[] args) throws IOException {
        WomensHealth prog = new WomensHealth("LLL",5);
        
    }
}
