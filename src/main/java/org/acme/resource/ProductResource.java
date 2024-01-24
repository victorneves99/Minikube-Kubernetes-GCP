package org.acme.resource;

import java.util.Set;

import org.acme.dto.Product;
import org.acme.response.Result;

import jakarta.inject.Inject;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Valid;
import jakarta.validation.Validator;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/product")
public class ProductResource {

  @POST
  public Result addProduct(@Valid Product product) {

    return new Result("Produto inserido é valido");

  }

}
