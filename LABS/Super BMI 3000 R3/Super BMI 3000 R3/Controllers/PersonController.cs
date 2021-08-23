using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Super_BMI_3000_R3.Business;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Super_BMI_3000_R3.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class PersonController : ControllerBase
    {
        public IActionResult Get(double gr, double gew)
        {
            return Ok(new Person() {Groesse=gr, Gewicht=gew });
        }
    }
}
