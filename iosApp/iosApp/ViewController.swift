//
//  ViewController.swift
//  iosApp
//
//  Created by ninehundreds on 2/12/22.
//

import UIKit
import shared

class ViewController: UIViewController {

    @IBOutlet weak var demoLabel: UILabel!


    override func viewDidLoad() {
        super.viewDidLoad()

        demoLabel.text = Greeting().greeting()
    }
}

