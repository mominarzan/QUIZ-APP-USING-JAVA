
//  QUESTION ANSWER PORTAL MADE  IN JAVA 
//  this was a group project made by 3 member

import java.util.*;
import java.util.Random;

class Random_gen
{
	int Random_number()
	{
		Random rand=new Random();
		int ran=rand.nextInt(51);
		return ran;
	}		

}
class Questions 
{	
	char ans;
	String q;
	String Ques(int ran_num)
	{	
		
        switch(ran_num)
        {
                case 1:
                q="The difference between the local value and face value of 7 in the numeral 657903 is: \n a. 0                 b. 7896            c. 6993                    d. 903 ";
                ans='c';
                break;
                case 2:
                q="The sum of three prime numbers is 100. If one of them exceeds another by 36, then one of the numbers is::\n a. 7                 b. 29                c. 41                d. 67";
                ans='d';
                break;
                case 3:
                q="(51+52+53+………+100) is equal to::\n a. 2525           b. 2975            c. 3225                        d. 3775";
                ans='d';
                break;
                case 4:
                q="The number 311311311311311311311 is:\n   a. divisible by 3 but not by 11         b. divisible by 11 but not by 3    c. divisible by both 3 and 11    d. neither divisible by 3 nor by 11.";
                ans='d';
                break;
                case 5:
                q="A number when divided by 3 leaves a remainder 1. When the quotient is divided by 2, it leaves a remainder 1. What will be the remainder when the number is divided by 6 ? :\n  a. 2                 b. 3                  c. 4                  d. 5";
                ans='c';
                break;
                case 6:
                q="A boy runs 200 metres  in 24 seconds. What is his speed ?:\n  a) 20 km/hr                  b) 24 km/hr                  c) 28.5 km/hr   d) 30 km/hr";
                ans='d';
                break;
                 case 7:
                q="If the speed of a man is 45 km per hour, then what is the distance traveled by him in 30 seconds ?  :\n   a) 275m           b)360m            c)375 m           d) 420 m";
                ans='c';
                break;
                case 8:
                q="An escalator moves towards the top level at the rate of 11 ft.sec and its length is 140 feet. If a person walks on the moving escalator at the rate of 3 feet per second towards the top level, how much timedoes he take to cover the entire length.  : \n    a) 14 sec          b) 10 sec          c) 12 sec          d)8 sec";
                ans='b';
                break;
                case 9:
                q=". A can do a work in 14 days and working together A and B can do the same work in 10 days. In what time can B alone do the work?:\n   a. 25 days    b. 30 days    c.  23 days     d. 35 days";
                ans='d';
                break;
                case 10:
                q="Manu, Manju and Maya can do a work in 90, 30 and 45 days respectively. If they work together, in how many days will they complete work?  :\n  a. 15    b. 10    c. 20    d. 25";
                ans='a';
                break;
                case 11:
                q="If A is thrice as fast as B and together can do a work in 21 days. In how many days A alone can do the work? :\n   a. 36   b. 42   c. 28    d. 54";
                ans='c';
                break;
                case 12:
                q="If each side of a square is increased by 50%, the ratio of the area of the resulting square to the area of the given square is::\n    a. 5:4          b. 9:4       c. 4:5        d. 4:9";
                ans='b';
                break;
                case 13:
                q="A man walking at the speed of 4 kmph crosses a square field diagonally in 3 minutes. The area of the field is::\n   a. 18000m         b. 20000m         c. 19000m          d. 25000m";
                ans='b';
                break;
                case 14:
                q="The cost of cultivating a square field at the rate of Rs.135 per hectare is Rs.1215. The cost of putting a fence around it at the rate of 75 paise per meter would be ::\n   a. Rs.360     b. Rs.810          c. Rs.900          d. Rs.1800 ";
                ans='c';
                break;
                case 15:
                q="The cost of carpeting a room 18m long with a carpet 75cm wide at 45 paise per meter is Rs.81. The breadth of the room is::\n    a. 7m          b. 7.5m           c. 8m           d. 8.5m";
                ans='b';
                break;
                case 16:
                q="A hall 36m long and 15m broad is to be paved with stones, each measuring 6dm by 5 dm. The number of stones required is::\n    a. 180            b. 1800           c. 18           d. 18000";
                ans='b';
                break;
                   case 17:
                q="A room 5.44m long and 3.74m broad is to be paved with square tiles. The least number of square tiles required to cover the floor is::\n   a. 176           b. 192               c. 184          d. 162";
                ans='a';
                break;
                case 18:
                q="A man cycles round the boundary of a rectangular park at the rate of 12 kmph and completes one full round in 8 minutes. If the ratio between the length and breadth of the park be 3:2, then its area is::\n   a. 1536m2           b. 15360m2             c. 153600m2           d. None of these";
                ans='c';
                break;
                case 19:
                q="A rectangular carpet has an area of 60 sq.m. If its diagonal and longer side together equal 5 times the shorter side, the length of the carpet is::\n    a. 5m              b. 12m                c. 13m           d. 14.5m ";
                ans='b';
                break;
                case 20:
                q="The cost of papering the four walls of a room is Rs.475. Each one of the length, breadth and height of another room is double that of this room. The cost of papering the walls of this new room is ::\n            a. Rs.950             b. Rs.1425               c. Rs.1900              d. Rs.712.50";
                ans='c';
                break;
               case 21:
                q="The height of a room to its semi-perimeter is 2:5. It costs Rs.260 to paper the walls of the room with paper 50cm wide at Rs.2 per meter allowing an area of 15 sq.m for doors and windows. The height of the room is::\n  a. 2.6m              b. 3.9m                  c. 4m            d. 4.2m";
                ans='c';
                break;
                case 22:
                q="If A : B  = 4 : 7 and B : C = 5 : 9 then A : B : C is :\n a) 20 : 35 : 63    b) 35 : 36 : 63         c) 30 : 35 : 65           d)25 :34: 68";
                ans='a';
                break;
                case 23:
                q="If  m : n  = 3 : 4 and n : o  = 8 : 9, then m : o is ::\n   a) 1 :3           b) 3 :2      c) 2 : 3      d) 1 : 2";
                ans='c';
                break;
                 case 24:
                q="If 15% of A is the same as 20% of B, then A : B  is ::\n   a) 3 : 4      b) 4 : 3             c) 17 : 16         d) 16 : 17";
                ans='b';
                break;
                case 25:
                q=" Which of the following  ratios is greatest ?   :\n   a) 7 :15            b) 15 :23          c) 17 :25          d) 21 :29";
                ans='d';
                break;
                case 26:
                q="Which of the following geographical term related with a body of land surrounded by water on three sides? :\n A. Peninsula   B. Gulf   C. Strait   D. Island";
                ans='a';
                break;
               case 27:
                q="Which of the following geographical term related with a naturally formed, narrow, typically navigable waterway that connects two larger bodies of water? :\n  A. Peninsula  B. Gulf   C. Strait    D. Island";
                ans='c';
                break;
                case 28:
                q="Which of the following is the largest Archipelago in the world ? :\n A. Andaman & Nicobar Island  B. Malaysia  C. Indonesia  D. Maldives";
                ans='c';
                break;
                case 29:
                q="Which of the following is the world’s largest peninsula ? :\n  A. India  B. South Africa  C. Arabia   D. Both A & B";
                ans='c';
                break;
                case 30:
                q="Which of the following pass has been created by the Indus River ? :\n A. Rohtas Pass  B. Nathula Pass   C. Baralachala Pass    D. Banihal Pass";
                ans='d';
                break;
                case 31:
                q=" Which of the following places receives the highest rainfall in the world ? :\n    A. Silchar   B. Cherrapunji   C. Mawsynram    D. Guwahati";
                ans='c';
                break;
                case 32:
                q="Which of the following factor is  characterises by  the cold weather season in India  ? :\n  A. Warm days and warm nights    B. Warm days and cold nights       C. Cool days and cold nights    D. Cold days and warm nights";
                ans='c';
                break;
                case 33:
                q="Which among the following Kavya of Sanskrit, deal with court intrigues & access to power of Chandragupta Maurya ?  :\n  A.  Mrichhakatika    B.  Ritusamhara   C.  Kumarasambhava    D.  Mudrarakshahsa";
                ans='d';
                break;
                case 34:
                q="Which king started the organization of Kumbh fair at Allahabad  ? :\n  A.  Harshavardhana     B. Dhruvasena  C.  Narshimhvarman     D.  Akabar";
                ans='a';
                break;
                case 35:
                q="What led to the end of Indus Valley Civilization ? :\n  A.  Invasion of Aryans   B.  Recurrent Floods   C.  Earthquakes   D.  All the above";
                ans='d';
                break;
                case 36:
                q="Which of the following is not true about the Muslim League ? :\n A. It was established by the Nawab Salimullah.    B.  It was established in Calcutta in 1906.    C. The league supported the partition on Bengal.     D.  The league opposed the Swadeshi movement.";
                ans='b';
                break;
                 case 37:
                q="India joined hands with UAE and which other country to implement 2 projects in Africa ? :\n (A)China  (B)Japan  (C)France  (D)Russia   (E) USA";
                ans='b';
                break;
                case 38:
                q=" Which country will host the world’s foremost Artificial Intelligence Summit ? :\n (A)India   (B)Oman  (C)China   (D)UAE   (E) Japan";
                ans='d';
                break;
                case 39:
                q="Which company has launched a 5G Use cases lab for banking and the financial sector ?  :\n (A)Infosys  (B)Intech  (C)IDRBT   (D)TCS    (E) IBM";
                ans='c';
                break;
                case 40:
                q="Who won 2019 Masters to claim 15th major in Golf ? :\n  (A)Dustin Johnson   (B)Xander Schauffele   (C)Tiger Woods   (D)Brooks Koepka    (E) Jason Day";
                ans='c';
                break;
                 case 41:
                q="The cost price of 20 articles is the same as the selling price of x articles. If the profit is 25%, then the value of x is :: \n  A.	 15    B.  16   C.  18     D.  25  ";
                ans='b';
                break;
                case 42:
                q=" In a certain store, the profit is 320% of the cost. If the cost increases by 25% but the selling price remains constant, approximately what percentage of the selling price is the profit ?  :\n  A.  30%    B.  70%   C.  100%     D. 250% ";
                ans='b';
                break;
                case 43:
                q="A vendor bought toffees at 6 for a rupee. How many for a rupee must he sell to gain 20 % ?  :\n A.  3   B.  4   C.  5    D.  6  ";
                ans='c';
                break;
                  case 44:
                q="The percentage profit earned by selling an article for Rs. 1920 is equal to the percentage loss incurred by selling the same article for Rs. 1280. At what price should the article be sold to make 25% profit ? :\n A.  Rs. 2000  B.  Rs. 2200   C.  Rs. 2400   D.  Data inadequate ";
                ans='a';
                break;
                case 45:
                q="A man buys a cycle for Rs. 1400 and sells it at a loss of 15%. What is the selling price of the cycle ? :\n  A.  Rs. 1090   B.  Rs. 1160   C.  Rs. 1190   D.  Rs. 1202 ";
                ans='c';
                break;
                case 46:
                q="An accurate clock shows 8 o'clock in the morning. Through how may degrees will the hour hand rotate when the clock shows 2 o'clock in the afternoon ? :\n  A.  144°   B.  150°   C.  168°   D.  180°";
                ans='d';
                break;
                 case 47:
                q=" A clock is started at noon. By 10 minutes past 5, the hour hand has turned through ::\n   A.  145°   B.  150°    C.  155°   D.  160°";
                ans='c';
                break;
                case 48:
                q="A and B invest in a business in the ratio 3 : 2. If 5% of the total profit goes to charity and A's share is Rs. 855, the total profit is :: \n  A.  Rs. 1425   B.  Rs. 1500   C.  Rs. 1537.50   D.  Rs. 1576";
                ans='b';
                break;
                case 49:
                q=" A, B, C subscribe Rs. 50,000 for a business. A subscribes Rs. 4000 more than B and B Rs. 5000 more than C. Out of a total profit of Rs. 35,000, A receives ::\n  A.	Rs. 8400   B.  Rs. 11,900   C.  Rs. 13,600   D.  Rs. 14,700";
                ans='d';
                break;
                  case 50:
                q=" A, B, C rent a pasture. A puts 10 oxen for 7 months, B puts 12 oxen for 5 months and C puts 15 oxen for 3 months for grazing. If the rent of the pasture is Rs. 175, how much must C pay as his share of rent ? :\n  A.	Rs. 45   B.  Rs. 50   C.  Rs. 55   D.  Rs. 60";
                ans='a';
                break;
                default:
                break;

        }
        return q;

}


}
class Calculate
{	
	int marks_obt=0;
	int Marks(int correct,int incorrect)
	{
		marks_obt=(correct*4)-(incorrect);
		return marks_obt;

	}

}
class Check extends Questions
{	
	

	int Check_ans(char entered,int rand_num)
	{
		Ques(rand_num);
		if(entered==ans)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}


}
public class Main
{
	
	public static void main(String args[])
	{
		Random_gen ran_num=new Random_gen();
		Questions ques=new Questions();
		Calculate cal=new Calculate();
		Check ch=new Check();
		Scanner s=new Scanner(System.in);
		int game=0,rand_num,checker,correct=0,incorrect=0,marks;
		int record[]=new int[50];
		char ans;
                System.out.println("********WELCOME TO QUESTION ANSWER PORTAL********** \n");
                System.out.println("rules and guideline \n 1.for every right answer your mark will increase by 4 \n 2.for every wrong answer there will be -1 deducted from your marks");
                 System.out.println("3.total marks will be printed at the end of program \n 4.YOU HAVE TO ATTEMPT ALL QUESTIONS COMPULSORY  \n 5. ANSWER MUST BE IN LOWER ALPHABET ONLY \n \n \n");
		for(int x=0;x<=49;x++)
      	{
          	record[x]=ran_num.Random_number();
          	if(x>0)
              	for(int c=0;c<=x-1;c++)
                  	if(record[c]==record[x])
                      	x--;
      	}
		while(game<=6)
		{	
			rand_num=ran_num.Random_number();
			String q=ques.Ques(record[game]);
			System.out.println(q);
			ans=s.next().charAt(0);
			checker=ch.Check_ans(ans,record[game]);
			if(checker==1)
			{
				correct+=1;
			}
			else
			{
				incorrect+=1;
			}
			game+=1;
for(int i=0;i<15;i++)
          {
           System.out.println("\n "); 
     i++;                    
          }
		}
		marks=cal.Marks(correct,incorrect);
		System.out.println("Your marks is: "+marks);
}
}
