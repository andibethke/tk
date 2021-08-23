using Microsoft.VisualStudio.TestTools.UnitTesting;
using Super_BMI_3000_R3.Business;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Super_BMI_3000_R3.Business.Tests
{
    [TestClass()]
    public class PersonTests
    {
        [TestMethod()]
        public void PersonTest()
        {
            Business.Person andi = new Person();
            andi.Groesse = 1.86;
            andi.Gewicht = 95;

            Assert.AreEqual(27.46, andi.Bmi);
            Assert.IsFalse(andi.IstOk);
        }
    }
}