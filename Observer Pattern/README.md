Lab2 – The Observer Pattern
• Ok, let us now explore the observer pattern by applying it to the
online auction system.
• You know how it works, don’t you? The auctioneer starts the bidding,
and auction participants (bidders) get notified about the slot. The
acceptance of the bid (you do not need to implement this part, do it
using setMeasurements() method in the main class) changes the bid
price which is broadcast to all of the bidders in the form of a new bid.
• We have three major players in this process; the auctioneer, the bid
data object, and the bidders.
• Your job is to implement an online auction system using the observer
pattern.
• Keep in mind that every slot has three important fields, namely slot
author, slot price and slot name. This information is entered by the
auctioneer every single time when he updates the bid and notifies
bidders (yes, I know, too old-school).
• Keep things simple, define who is your subject, who are your
observers, and what kind of methods are used to define the
communication (refer to the course book).
• Implement this task using your own observer pattern and then do the
same task using the Java built-in Observer Pattern
 
