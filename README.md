Branch.io makes it simple to enable Android App Links all while greatly improving on them, offering full attribution, supporting edge cases and the enhanced way to deep linking.

Steps to integrate :

1. Register app at : https://dashboard.branch.io/link-settings and get required keys

2. Add Branch.io library in build.gradle as

implementation 'io.branch.sdk.android:library:2.+'

3. Add intent filters in AndroidManifest.xml under specific activity class (code attached)

3. In Application class initialise Branch.io as under onCreate()

// Branch logging for debugging
Branch.enableLogging();

// Branch object initialization
Branch.getAutoInstance(this);

4. Handle Branch.io code in your activity class

private fun branchIO() {

// Branch init
Branch.getInstance().initSession({ referringParams, error ->
if (error == null) {

// TODO: Handle condition here

} else {

}
}, this.intent.data, this)

}


5. Create assetlinks.json file (attached)

** This assetlinks.json file must be served over https:// server with a valid SSL certificate.


Reference link :
1. https://docs.branch.io/pages/deep-linki ... app-links/
2. https://medium.com/@ageitgey/everything ... 348b265b49


