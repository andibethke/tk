using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Super_BMI_3000_R3.Business
{
    public class Person
    {
        public Person()
        {

        }
        public double Groesse { get; set; }
        public double Gewicht { get; set; }

        public double Bmi => Math.Round( Gewicht / (Groesse * Groesse),2);

        public bool IstOk => Bmi >= 19 && Bmi <= 24;
    }
}
