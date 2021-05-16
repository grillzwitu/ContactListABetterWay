# ContactListABetterWay

This project is a simple android app that showcases the use of __RecyclerView__, __LayoutManager__, __Adapter__ classes, __Binding__, __Intent__ using the kotlin programming language.  
The app is a __Contacts__ app, when launched it shows contact categories in a recycler view, which when clicked opens the respective categories where a phone contact can be added
by clicking on a __floating action button__, that generates an __input form__ in a __dialog__, which then saves/adds the contact to the list by clicking the __save button__.  

__Note__: This app does not yet save the contacts created in any database, once the user exits a contact category list/view the contact list is cleared.

## Description

- ### Launch View

![Alt](/ContactListApp_demo/contact-categories.png "Launch View")

- ### Family Category

![Alt](/ContactListApp_demo/fam-cat-empty-dialoglaunched-with-input.png "Family category empty list, dialog launched and form filled view")
![Alt](/ContactListApp_demo/fam-cat-input_saved.png "Family category saved new contact view")
![Alt](/ContactListApp_demo/fam-cat-not_empty-dialoglaunched-with-input.png "Family category data entry for another new contact view")
![Alt](/ContactListApp_demo/fam-cat-input_saved1.png "Family category second new contact saved view")

- ### Friends Category

![Alt](/ContactListApp_demo/friends-cat-empty-dialoglaunched-with-input.png "Friends category empty list, dialog launched and form filled view")  ![Alt](/ContactListApp_demo/friends-cat-input_saved.png "Friends category saved new contact view")

- ### Work Category

![Alt](/ContactListApp_demo/work-cat-empty-dialoglaunched-with-input.png "Work category empty list, dialog launched and form filled view")  ![Alt](/ContactListApp_demo/work-cat-input_saved.png "Work category saved new contact view")

- ### School Category

![Alt](/ContactListApp_demo/school-cat-empty-dialoglaunched-with-input.png "School category empty list, dialog launched and form filled view")  ![Alt](/ContactListApp_demo/school-cat-input_saved.png "School category saved new contact view")
