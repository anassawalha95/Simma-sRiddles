# Simma's Riddles

---

### Question 1:

You're at a friend’s wedding, who seems to be a cheap friend! Anyway, there are 200 attendees and he only has 200 JDs in his pocket.

The groom asks you to:

i. Every single attendee needs to get an item, and you should buy at least a single item from every single item on the menu.

ii. And not to spend more than 200 JDs.

Menu :

Item 1: Fizzy drinks .......................... 0.2 JDs

Item 2: Boston Creme Donut ........... 2 JDs

Item 3: 500g Angus Beef Burger ... 10 JDs

How many items will you end up buying from item 3 (The Beef Burger)?

#### solution:

0.2x+2y+10z=200 **---- equation 1**

x+y+z=200 **---- equation 2**

From Equation 2 the value of x:

x=200-y-z

**replace equation 2 in equation 1**

0.2(200-y-z )+2y+10z=200

1.8y+9.8z+40=200

5 *( 1.8y+9.8z+40)=200 *5

9y+ 49z=800

y = ( -49z+800 )/9 **---- equation 3**

**replace equation 3 in equation 2 for the value of X**

x = 200-y-z

x = 200-(( -49z+800 )/9) - z

9 \* x = ( 200 - (( -49z+800 )/9) - z ) 9

9x= 200 \* 9 + 49z - 800 -9z

9 / 9x= 200 \* 9 + 40z - 800 /9

x = 200 + ( 40z -800)/9 **---- equation 4**

**To find the value of y we must find a number that divid by nine and less than 800**

z= 11 Then:

y = ( -49z+800 )/9

y = (-49\*29 + 800)/9

y = 261/9

y = 29

**To find the value of x we must find a number that divid by nine and less than 800**

z= 11 Then:

x = 200 + ( 40z -800)/9

x = 200 + ( 40\* 11 -800)/9

x = 160

---

### Question 2:

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get:

3, 5, 6 and 9 >>>

If we add them up, the sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

#### solution:

In order to find the solution we must use these forumlas
an = is the last term
n = number of the terms
a1= first term
d= difference between each term
Sn= total summation of the terms

an=a1+(n-1)d
Sn= n/2 _ (2a+(n-1) _ d)

**For the first series:**
a1 = 3
d = 3
an <1000 so an= 999
n=333
Sn=166833

an=a1+(n-1)d
999=3+(n-1)3
999=3+3n-3
3/ 999 = 3n /3
n=333

Sn= n/2 _ (2a+(n-1) _ d)
Sn= 333/2 * (2*3 +(333-1)3)
Sn= 166.5 \*(6 +996)
Sn=166833

**For the Second series:**

a1 = 5
d = 5
an <1000 so an= 995
n=199
Sn=199

an=a1+(n-1)d
995=5+(n-1)5
995=5+5n-5
5/ 995 = 5n /5
n=199

Sn= n/2 _ (2a+(n-1) _ d)
Sn= 199/2 * (2*5 +(199-1)5)
Sn= 99.5 \*(10 +990)
Sn=99500

**Combination of first and the second series:**
In order to find the summation of the first series we must apply inclusive-exlusive
since we have two values we will have dublicated values that must be deleted.

a1=15
d = 15
an <1000 so an= 990
n=66
Sn=

an=a1+(n-1)d
990=15+(n-1)15
990=15+15n-15
15/ 990 = 15n /15
n=66

Sn= n/2 _ (2a+(n-1) _ d)
Sn= 66/2 * (2*15 +(66-1)15)
Sn= 33 \*(30 +975)
Sn=33165

**now we can sum the Sn of the 3 and 5 and subtract the Sn of 15**

Sn = Sn3 + Sn5 - Sn15
Sn = 166833 + 99500 - 33165
Sn = 233168
