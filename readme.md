# BALLibraries
# Requirements
Gradle version gradle 7.3.3 and higher
## The BALLiberies will have multiple aar files, to use the lib download it and place these in your project dependency.

You can achieve this in following ways 
1. put the downloaded BalLibs into local (in_your_home_dir/.m2/repository) and extract the lib and place it and add the mavenLocal() in your repositories on top in root gradle file.
2. add all the aar files in your project Libs or as a module by impoting it into project in Android studio
3. add the jitpack dependency like refer [jitpack](https://jitpack.io/#nkjha700011/SampleLib/0.0.1)
## Usage
The below sample of code is in Java syntex may vary in other then java like kotlin or typescript as per platform and language but steps will be same as below
# Step 1. create the BALBTDongleLib class instance like below
	
	BALBTDongleLib balbtDongleLib = new BALBTDongleLib(mInputStream, mOutputStream);
	
	# these parameter are 
	
	@NonNull InputStream mInputStream, 
	@NonNull OutputStream mOutputStream 
	which app need to get form `BluetoothSocket` instance of connected device.
	
	 
# Step 2. once you have the instance(BALBTDongleLib) then you need to initialize the dongle by calling the below function 

	balbtDongleLib.initBTDongleComm(bt_dongle_name);
	
# Step 3. to read a vin you need to call the function as

	balbtDongleLib.readVIN(); 
	
# on a user click event
# Step 4. to write a vin you need to call the function as

	balbtDongleLib.writeVIN("MD2B37AXXLPM33903");
	
	# this parameter is
	
	@NonNull String vin
	
# on a user click event
# Step 4. To reset Dongle for other functionality call below fuinction

	balbtDongleLib.resetConfig();
