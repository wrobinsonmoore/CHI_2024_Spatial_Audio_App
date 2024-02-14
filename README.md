<!-- omit from toc -->
# Spatial Audio-Enhanced Multimodal Graph Rendering for Efficient Data Trend Learning on Touchscreen Devices
This repo contains all the source code and the APK file for the user study performed for the CHI 2024 Paper: Spatial Audio-Enhanced Multimodal Graph Rendering for Efficient Data Trend Learning on Touchscreen Devices. In addition, it contains a brief step-by-step tutorial on how to deploy the app to your Android device and how to use it to freely explore the available multimodally rendered graphs.

<!-- omit from toc -->
# Table of Contents
- [1. Deploying the App on Your Device (Easy!)](#1-deploying-the-app-on-your-device-easy)
- [2. App Usage Tutorial](#2-app-usage-tutorial)
- [3. Modifying the Source Code (Advanced!)](#3-modifying-the-source-code-advanced)
- [4. Contact Us](#4-contact-us)


# 1. Deploying the App on Your Device (Easy!)
To deploy the app on your Android device, follow these steps:
1. Enable the option to install apps from unknown sources. [Here](https://www.androidauthority.com/how-to-install-apks-31494/) is a quick tutorial on how to do so. Other tutorials can be found on Google by searching "Install apps from unknown sources in Android".
2. Download the .apk file from this repo. 
3. Transfer the .apk file to a directory of your choice in your device. 
6. In your device, use your File Explorer (or equivalent file browsing app) to go to the directory where you put your .apk file.
7. Open it, select "Allow" in case the device asks you if you trust this source, and then let the app install. Done!

# 2. App Usage Tutorial
After installation, follow these steps to use the app and navigate through the different graphs:
1. **Allow App Permissions**: The app will start by asking you for permission to manage your Internal Storage. This is because, once you are in a graph, the app will start logging all your finger positions while you explore the graph. All your information will be stored in your device's ./Documents/Finger_Location_Data/ folder. Each graph will output a separate CSV file for simple post-analysis of your data. No other information is stored when you use the app. 
2. **Enter a Participant Number**: After permissions have been granted, you will be given the option to enter a Participant Number. The Participant Number will be the prefix for all the file names generated while exploring the graphs, as described in the previous step. You may leave this field blank if needed. If you wish to change the Participant Number, you can always press Back in the Main Menu (Graph Selector) and enter a new participant number. 
3. **Choose a Graph to Explore**: After you have input a Participant Number, you will be presented with the Main Menu. The app has 12 explorable graphs included by default. Our CHI 2024 submission only utilized 8 of these (4 for training, 4 for testing) for the user study and analysis. You are free to explore all of these graphs and modify them according to your needs.
4. **Lock-Task Mode**: Once you open up a graph, you will receive a notification telling you that the app has entered Lock Task Mode. This mode simply prevents the user from using the navigation buttons, physical or not, to leave the graph or leave the app. This functionality was included to aid blind and visually impaired in their free graph exploration and prevent them from unwillingly touching the Back, Home, or Recents buttons, since in newer tablets, these stopped being physical butttons and became an on-screen touch-based interface. To turn off Lock Task Mode, simply press the Back and Recents buttons at the same time for 3 seconds. You will receive a notification that Lock Task Mode has been disabled, and now functionality will return to your Back, Home, and Recents buttons.
5. **Leave a Graph**: To leave a graph after exploration, perform a 4-finger SWIPE UP. This will bring you back to the Main Menu. 
  

# 3. Modifying the Source Code (Advanced!)
To modify the source code of this app and customize it to your own needs, you will need [Android Studio](https://developer.android.com/studio?gad_source=1&gclid=Cj0KCQiAoKeuBhCoARIsAB4WxtdRhJsgphPmlxnRHIUZieIOhDLoCclxkKIc5MZgmkvwq3NGdQtLwkUaAvVnEALw_wcB&gclsrc=aw.ds) or similar software for Android Development. Clone this repository to a directory of your choice, and open up the CHI_2024_Spatial_Audio_Dev_App folder in Android Studio. You are now free to modify any of the apps contents and adapt it to your needs. The code is heavily commented to allow any developer to skim through it and understand its functionality.

# 4. Contact Us
If you have any questions, feel free to contact us at the following emails:
- Wilfredo J. Robinson M., wilfredo.robinsonmoore@slu.edu
- Jennifer L. Tennison, jen.tennison@slu.edu
