
<html>
<body>

      <form action="validate" method="post">
      
            <script type="text/javascript">
          function custQueryEnableDisable(customQuery) 
          {
              var customQuery = document.getElementById("outputCheck");
              outputCheck.disabled = customQuery.checked ? false : true;
                          
              var assertValues = document.getElementById("resultCount");
              assertValues.disabled = customQuery.checked ? false : true;
                          
              var resultCount = document.getElementById("operator");
              resultCount.disabled = customQuery.checked ? false : true;
            
              var customQueryTA = document.getElementById("customQueryTA");
              customQueryTA.disabled = customQuery.checked ? false : true;
      }
          
          function AssertValueEnableDisable(assertValues)
          {
            var operator = document.getElementById("operator");
              operator.disabled = assertValues.checked ? false : true;
              
              var value = document.getElementById("value");
              value.disabled = assertValues.checked ? false : true;
            
          }
          
          function CustomValueEnableDisable(customColumnDataTypeCheck)
          {
            var customColumn = document.getElementById("customColumn");
            customColumn.disabled = customColumnDataTypeCheck.checked ? false : true;
          }
          
          function DestinationEnableDisable(value1)
          {
        	  var table2 = document.getElementById("table2");
          	  var hdfs2tb = document.getElementById("hdfs2tb");
        	  if(value1 == "db2")
        	  {
        		  	table2.disabled = false;
          			hdfs2tb.disabled=true;
        	  }
        	  if(value1 == "hdfs2")
        	  {
        		 	table2.disabled = true;
          			hdfs2tb.disabled = false;
        	  }
          	}
          
          function SourceEnableDisable(value)
          {
        	  var table1=document.getElementById("table1");
        	  var hdfs1tb=document.getElementById("hdfs1tb");
        	  if(value == "db1")
        	  { 
        			table1.disabled = false;
          			hdfs1tb.disabled = true;
        	  }
        	  if(value == "hdfs1")
        	  {
        		     table1.disabled = true;
 			         hdfs1tb.disabled=false;
        	  }
          }
       	 </script>
            
            <h2 align="center">Validation Framework</h2>
            <table style="width:80%" align="center">
              <tr>
                <td>
                        Source:
                       <select required="required" name="Source" id="Source" onchange="SourceEnableDisable(this.value)" >
                             <option selected disabled hidden="">Select</option>
                              <option value="db1" id= "db1">Hive Table</option>
                              <option value="hdfs1" id= "hdfs1" >HDFS</option>
                        </select>   
                </td>
                  <td >
                        Destination:
                        <select required="required" id="destination" name="destination" onchange="DestinationEnableDisable(this.value)">
                          <option selected disabled hidden="">Select</option>
                          <option value="db2" id="db2">Hive Table</option>
                          <option value="hdfs2" id="hdfs2">HDFS</option>
                        </select>
                        <br>
                 </td>
              </tr>
              <tr></tr>
                  <tr>
                        <td>
                              Table : <input type="text" id= "table1" name="table1" disabled required="required">
                        </td>
                        <td>
                              Table : <input type="text" id= "table2" name="table2" disabled required="required">
                        </td>
                  </tr>
                  
                  <tr>
                        <td>
                              HDFS: <input type="text" id= "hdfs1tb" name="hdfs1tb" disabled required="required">
                        </td>
                        <td>
                              HDFS: <input type="text" id= "hdfs2tb" name="hdfs2tb" disabled required="required">
                        </td>
                  </tr>                         
            </table>

            <br><br>
      
            <div style="padding-left:10%">
                  <b>Data Validation:</b><br>
                  <input type="checkbox" value="rowByRow" name="rowByRow">Row by Row   <br>
                  <input type="checkbox" value="validationOfSamples" name="validationOfSamples">Validation of samples  <br>
                  <input type="checkbox" id="customQuery" value="customQuery" name="customQuery" onclick="custQueryEnableDisable(this)" >
                  Custom Query <textarea id="customQueryTA" disabled="disabled" rows="1" cols="40" value="" name="customQueryTA" required="required"></textarea>
            </div>
            
            <div style="padding-left: 20%">
            
                  <input type="checkbox" id="outputCheck" disabled="disabled" value="outputCheck" name="outputCheck">Output Check<br>
                  <input type="checkbox" id="assertValues" disabled="disabled" onclick="AssertValueEnableDisable(this)" value="assertValues" name="assertValues">Assert Values    ---
                  operator :  <input type="text" id=operator style="width:50px" disabled=true value="" name="operator" required="required"> 
                  Value :<input type="text" id="value" style="width:50px"  disabled=true name="value" required="required"><br> 
                  <input type="checkbox" id="resultCount" disabled="disabled" value="resultCount" name="resultCount">Result Count
            </div>
            
            <br><br>
            <div style="padding-left: 10%">
                  <b>Meta-Data Validation:</b> <br>
                  <input type="checkbox" id="columnCountCheck" value="columnCountCheck" name="columnCountCheck"> Column Count Check <br>
                  <input type="checkbox" id="allColumnDataTypeCheck" value="allColumnDataCheck" name="allColumnDataTypeCheck"> All Column Data Type Check <br>
                  <input type="checkbox" id="customColumnDataTypeCheck" onclick="customValueEnableDisable(this)" value="customColumnDataTypeCheck" name="customColumnDataTypeCheck"> Custom Column : 
                  <input type="text" id="customColumn" style="width: 200px" disabled="true" value="" name="customColumn" required="required">
            </div>
            
            <br><br><br>
            <div align="center">
            <input type ="submit" value="Validate">
            </div>
      </form>
</body>
</html>
