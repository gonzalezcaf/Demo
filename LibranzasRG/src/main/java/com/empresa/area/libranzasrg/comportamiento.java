package com.empresa.area.libranzasrg;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Description("objeto de datos con el comportamiento financiero del cliente en el sector e internamente")
public class comportamiento implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("externo")
   @org.kie.api.definition.type.Description("comportamiento en el sector financiero")
   private java.lang.Boolean externo;
   @org.kie.api.definition.type.Label("interno")
   @org.kie.api.definition.type.Description("Comportamiento interno con productos dle Banco")
   private java.lang.Boolean interno;

   public comportamiento()
   {
   }

   public java.lang.Boolean getExterno()
   {
      return this.externo;
   }

   public void setExterno(java.lang.Boolean externo)
   {
      this.externo = externo;
   }

   public java.lang.Boolean getInterno()
   {
      return this.interno;
   }

   public void setInterno(java.lang.Boolean interno)
   {
      this.interno = interno;
   }

   public comportamiento(java.lang.Boolean externo, java.lang.Boolean interno)
   {
      this.externo = externo;
      this.interno = interno;
   }

}