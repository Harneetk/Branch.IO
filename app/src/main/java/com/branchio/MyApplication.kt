package com.branchio

import android.app.Application
import io.branch.referral.Branch

/**
 * Created by amarjit.kaur on 30/10/18.
 */
class MyApplication : Application() {


    override fun onCreate() {
        super.onCreate()

        // Branch logging for debugging
        Branch.enableLogging()

        // Branch object initialization
        Branch.getAutoInstance(this)

    }

}