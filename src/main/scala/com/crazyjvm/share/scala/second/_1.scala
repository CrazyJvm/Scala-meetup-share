package com.crazyjvm.share.scala.second

/**
 * Created by chenchao on 14-6-9.
 */
class BankAccount {
  private var account : Int = 0

  def deposit(money : Int){
    account += money
    println("There is " + account + " yuan in your account!")
  }

  def withdraw(money : Int){
    assert(money <= account, "The money you withdraw should be less than account!")
    account -= money
    println("There is " + account + " yuan in your account!")
  }

  def balance = account
}
