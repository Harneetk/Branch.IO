package com.branchio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.branch.referral.Branch
import io.branch.referral.BranchError
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        branchIO()
    }

    private fun branchIO() {

        // Branch init
        Branch.getInstance().initSession({ referringParams, error ->
            if (error == null) {

// TODO: Handle condition here

            } else {

            }
        }, this.intent.data, this)

    }
}
